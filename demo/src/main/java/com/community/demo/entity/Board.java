package com.community.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="board")
public class Board extends TimeBase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;
    @Column(length = 200, nullable = false)
    private String title;
    @Column(length = 200, nullable = false)
    private String writer;
    @Column(length = 2000, nullable = false)
    private String content;
    @Column(name = "read_count", columnDefinition = "int default 0")
    private int readCount;
    @Column(name = "cmt_qty", columnDefinition = "int default 0")
    private int cmtQty;
    @Column(name = "file_qty", columnDefinition = "int default 0")
    private int fileQty;
}
