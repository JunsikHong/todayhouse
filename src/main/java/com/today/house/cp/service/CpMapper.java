package com.today.house.cp.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.today.house.command.CpExVO;
import com.today.house.command.CpVO;
import com.today.house.util.CpCriteria;

@Mapper
public interface CpMapper {

	
	public CpVO cp_login_form(CpVO vo); //로그인
	public CpVO cp_mypage_check_form(CpVO vo); //마이페이지 비밀번호확인
	public int cp_mypage_change(CpVO vo); //마이페이지 정보수정
	public int cp_regist_form(CpVO vo); //회원가입
	public ArrayList<CpVO> cp_getList(@Param("cp_major") String cp_major, 
									  @Param("cri") CpCriteria cri); //시공사 목록 갖고오기
	public int getTotal(@Param("cp_major") String cp_major, 
						@Param("cri") CpCriteria cri); //총합 구하기
	public CpVO cp_getdetail(String cp_id); //시공사 상세정보
	public ArrayList<CpExVO> cp_getExdetail(String cp_id); //시공사례 정보 리스트
	public int cp_content_ex_regist (CpExVO vo); //시공사례등록
	public CpExVO cp_content_ex_detail (CpExVO vo); //시공사 사례 상세
}
