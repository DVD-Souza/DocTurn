package com.fsateam.document_convert_api.dto.DtoSaida;

import com.fsateam.document_convert_api.model.File;

import java.time.LocalDateTime;


public record DownloadFileDto(
        File sourceDocument,
        File targetDocumente,
        LocalDateTime startedAt,
        LocalDateTime finishedAt
)
{}
