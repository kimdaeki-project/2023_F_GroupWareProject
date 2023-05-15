package com.ware.group.approval;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApprovalCategoryVO {
	private long id;
	private String name;
	private long ref;
	
	private ApproverVO[] approverList;
	private ApprovalFormFileVO[] approvalFileList;
}
