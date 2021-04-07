package com.shareexchange.controller;

import com.shareexchange.dto.ShareSearchParam;
import com.shareexchange.model.Share;
import com.shareexchange.service.ShareService;
import common.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shareController")
public class ShareController {

    @Autowired
    private ShareService shareService;

    @RequestMapping("/search")
    public ResultEntity<List<Share>> searchShare(@RequestBody ShareSearchParam param){
        List<Share> result = shareService.searchShare(param);
        return ResultEntity.getInstance(0, "返回结果", result);
    }

    @RequestMapping("/searchShareMyself")
    public ResultEntity<List<Share>> searchShareMyself(@RequestBody Long userId){
        if(userId == null){
            return ResultEntity.getInstance(10000, "参数错误", null);
        }
        List<Share> result = shareService.searchShareMyself(userId);
        return ResultEntity.getInstance(0, "返回结果", result);
    }

    /**
     * 新增分享
     */
    @RequestMapping("/addShare")
    public ResultEntity<List<Share>> addShare(@RequestBody Share param){
        List<Share> result = shareService.addShare(param);
        return ResultEntity.getInstance(0, "返回结果", result);
    }

    /**
     * 下架分享
     */
    @RequestMapping("/outShare")
    public ResultEntity<List<Share>> outShare(@RequestBody ShareSearchParam param){
        List<Share> result = shareService.outShare(param);
        return ResultEntity.getInstance(0, "返回结果", result);
    }

    /**
     * 申请分享
     */
    @RequestMapping("/applyShare")
    public ResultEntity<List<Share>> applyShare(@RequestBody ShareSearchParam param){
        List<Share> result = shareService.applyShare(param);
        return ResultEntity.getInstance(0, "返回结果", result);
    }

    /**
     * 同意分享
     */
    @RequestMapping("/agreeShare")
    public ResultEntity<List<Share>> agreeShare(@RequestBody ShareSearchParam param){
        List<Share> result = shareService.agreeShare(param);
        return ResultEntity.getInstance(0, "返回结果", result);
    }

    /**
     * 取消分享
     */
    @RequestMapping("/stopShare")
    public ResultEntity<List<Share>> stopShare(@RequestBody ShareSearchParam param){
        List<Share> result = shareService.stopShare(param);
        return ResultEntity.getInstance(0, "返回结果", result);
    }

}
