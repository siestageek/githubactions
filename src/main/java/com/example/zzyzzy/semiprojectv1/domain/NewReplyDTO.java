package com.example.zzyzzy.semiprojectv1.domain;

import lombok.Data;
import lombok.Builder;

@Data
@Builder
public class NewReplyDTO {
    private String comments;
    private String userid;
    private Long ref;
    private Long pno;
}
