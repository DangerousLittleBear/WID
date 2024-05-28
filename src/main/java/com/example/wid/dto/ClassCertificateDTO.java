package com.example.wid.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
public class ClassCertificateDTO {
    private String studentId;
    private String subject;
    private String professor;
    private String summary;
    private String startDate;
    private String endDate;
    // 수업 인증서 발급자 이메일
    // 이슈어가 누군지 식별하기 위함
    private String issuerEmail;

    private MultipartFile file;

    @Builder
    public ClassCertificateDTO(String studentId, String subject, String professor, String summary, String startDate, String endDate, String issuerEmail, MultipartFile file) {
        this.studentId = studentId;
        this.subject = subject;
        this.professor = professor;
        this.summary = summary;
        this.startDate = startDate;
        this.endDate = endDate;
        this.issuerEmail = issuerEmail;
        this.file = file;
    }
}
