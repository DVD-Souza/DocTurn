package com.fsateam.document_convert_api.model;
import lombok.*;

import java.nio.file.Path;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class File {
    @NonNull
    private long id;

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