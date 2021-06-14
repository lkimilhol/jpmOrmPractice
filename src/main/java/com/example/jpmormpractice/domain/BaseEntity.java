package com.example.jpmormpractice.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {
    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
