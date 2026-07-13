package com.fsateam.document_convert_api.model;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.nio.file.Path;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class File {
    @NonNull
    @Id
    private UUID id = UUID.randomUUID();

    @NonNull
    private String name;

    @NonNull
    private String type;

    @NonNull
    private long size;

    @NonNull
    private FileFormatTypes format;

    @NonNull
    private Path path;


}