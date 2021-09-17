package com.board.domain;

import lombok.Data;

@Data
public class CommentDTO extends CommonDTO{
	
	private Long idx;
	
	private Long boardIdx;
	
	private String content;
	
	private String writer;

}
