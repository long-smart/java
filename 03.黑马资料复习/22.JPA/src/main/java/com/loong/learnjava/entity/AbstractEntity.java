package com.loong.learnjava.entity;

import javax.persistence.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column(nullable = true, updatable = false)
    private Long createdAt;

    public AbstractEntity() {
    }

    public AbstractEntity(Long id, Long createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    // 虚拟属性, 计算得出。而不是在数据库里
    @Transient
    public ZonedDateTime getCreatedDateTime() {
        return Instant.ofEpochMilli(this.createdAt).atZone(ZoneId.systemDefault());
    }

    // 表示将一个JavaBean持久化到数据库之前（即执行INSERT语句），Hibernate会先执行该方法
    @PrePersist
    public void preInsert() {
        setCreatedAt(System.currentTimeMillis());
    }
}
