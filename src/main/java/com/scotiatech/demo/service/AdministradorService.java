package com.scotiatech.demo.service;

import com.scotiatech.demo.dto.ResponseDto;
import com.scotiatech.demo.entity.UsuarioEntity;

import java.util.List;

public interface AdministradorService {
    ResponseDto<List<UsuarioEntity>> usuario();
}

