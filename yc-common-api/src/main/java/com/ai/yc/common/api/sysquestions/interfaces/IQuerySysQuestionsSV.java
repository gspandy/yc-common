package com.ai.yc.common.api.sysquestions.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.BaseResponse;
import com.ai.yc.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.ai.yc.common.api.sysquestions.param.DeleteSysQuestions;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.ai.yc.common.api.sysquestions.param.QuestionsPageQueryResponse;
import com.ai.yc.common.api.sysquestions.param.QuestionsPapersResponse;
import com.ai.yc.common.api.sysquestions.param.SaveSysQuestions;

/**
 * @Description: 题目查询服务
 * @author shancc
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Path("/sysquestions")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysQuestionsSV {
	
	/**
     * 题目列表查询分页
     * @return 题目列表
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysquestions/queryQuestionsPage
	 */
	@POST
	@Path("/queryQuestionsPage")
	public QuestionsPageQueryResponse queryQuestionsPage(QuestionsPageQueryRequest param)throws BusinessException,SystemException;
	
	/**
     * 题目数量查询
     * @return 题目数量
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysquestions/queryQuestionsNumber
	 */
	@POST
	@Path("/queryQuestionsNumber")
	public Integer queryQuestionsNumber(QuestionsPageQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 添加选择题目
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysquestions/saveSysQuestions
     */
	@POST
	@Path("/saveSysQuestions")
	public BaseResponse saveSysQuestions(SaveSysQuestions req)throws BusinessException,SystemException;
	
	/**
	 * 删除
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysquestions/deleteSysQuestions
     */
	@POST
	@Path("/deleteSysQuestions")
	public Integer deleteSysQuestions(DeleteSysQuestions param)throws BusinessException,SystemException;
	
	/**
	 * 修改题目
	 * @throws BusinessException,SystemException
	 * @author shancc
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysquestions/updateSysQuestions
     */
	@POST
	@Path("/updateSysQuestions")
	public BaseResponse updateSysQuestions(SaveSysQuestions req)throws BusinessException,SystemException;
	
	
	/**
     * 生成试卷服务
     * @return 题目
     * @throws BusinessException,SystemException
     * @author shancc
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysquestions/questionsPapers
	 */
	@POST
	@Path("/questionsPapers")
	public QuestionsPapersResponse questionsPapers(ItemBankPageQueryRequest param)throws BusinessException,SystemException;
}
