package com.fsateam.document_convert_api.model;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class File {
    private long id;
    @NonNull
    private String name;
    @NonNull
    private String type;
    @NonNull
    private long size;
    @NonNull
    private FileFormat format;
    @NonNull
    private Path path;
    @NonNull


}