package com.example.jpmormpractice.domain;

import lombok.Getter;
import lombok.Setter;
import org.graalvm.compiler.lir.LIRInstruction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "MEMBER_ID")
    Long memberId;

    @Temporal(TemporalType.TIMESTAMP)
    LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    Status status;
}
