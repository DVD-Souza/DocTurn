package com.fsateam.document_convert_api.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Conversion {
    private Long id;
    @NonNull
    private File sourceDocument;
    @NonNull
    private File targetDocument;
    @NonNull
    private LocalDateTime startedAt;
    @NonNull
    private LocalDateTime finishedAt;

    private enum ConversionType{
        PDF,
        DOCX
    }

    private enum Status{
        IN_PROGRESS,
        COMPLETE,
        FAILED
    }
}
