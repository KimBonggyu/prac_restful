package com.board.domain;

import java.util.Date;

import com.board.paging.Criteria;
import com.board.paging.PaginationInfo;

import lombok.Data;

@Data
public class CommonDTO extends Criteria{
	
	/** 페이징 정보 */
	private PaginationInfo paginationInfo;

	/** 삭제 여부 */
	private String deleteYn;

	/** 등록일 */
	private Date insertTime;

	/** 수정일 */
	private Date updateTime;

	/** 삭제일 */
	private Date deleteTime;

}
