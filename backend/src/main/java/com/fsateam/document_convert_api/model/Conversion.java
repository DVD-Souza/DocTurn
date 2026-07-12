package com.fsateam.document_convert_api.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Conversion {
    @Id
    private UUID id = UUID.randomUUID();
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
