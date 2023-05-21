package com.akkulahali.mapper;

import com.akkulahali.dto.request.MovieCommentCreateRequestDto;
import com.akkulahali.dto.request.UserRegisterRequestDto;
import com.akkulahali.dto.response.LoginResponseDto;
import com.akkulahali.repository.entity.MovieComment;
import com.akkulahali.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {

    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);

    User toUser(final UserRegisterRequestDto dto);

    LoginResponseDto toLoginResponseDto(final User user);

    MovieComment toMovieComment(final MovieCommentCreateRequestDto dto);
}