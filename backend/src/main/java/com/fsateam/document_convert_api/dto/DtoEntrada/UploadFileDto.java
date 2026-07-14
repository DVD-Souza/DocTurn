package com.fsateam.document_convert_api.dto.DtoEntrada;

import com.fsateam.document_convert_api.model.FileFormatTypes;

import java.nio.file.Path;

public record UploadFileDto(
        String name,
        String type,
        long size,
        FileFormatTypes format,
        Path path
)
{}
