package com.example.ecolecdansopra24.services;

import com.example.ecolecdansopra24.dtos.NoteDto;

public interface INoteService {

    /**
     * Insere une note en base
     * @return
     */
    Integer addNotes(NoteDto dto);

    Integer getAVG(Integer id);
}
