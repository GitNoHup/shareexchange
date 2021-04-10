package com.shareexchange.service;

import com.shareexchange.dto.RegisterRequestDto;
import com.shareexchange.dto.ShareSearchParam;
import com.shareexchange.mapper.ShareMapper;
import com.shareexchange.model.Share;
import com.shareexchange.model.ShareExample;
import org.springframework.stereotype.Service;
import shareexchange.ShareEnum;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShareService {

    @Resource
    ShareMapper shareMapper;

    /**
     * 查询所有有效的分享
     */
    public List<Share> searchShare(ShareSearchParam param){
        List<Byte> statusList = new ArrayList<>();
        statusList.add(ShareEnum.WAIT_SHARE.getCode());
        statusList.add(ShareEnum.SHARING.getCode());
        ShareExample shareExample = new ShareExample();
        if(param.getShareName() != null){
            shareExample.createCriteria()
                    .andStatusIn(statusList)
                    .andShareNameLike(param.getShareName());
        } else {
            shareExample.createCriteria()
                    .andStatusIn(statusList);
        }
        return shareMapper.selectByExample(shareExample);
    }

    /**
     * 查询自己的分享
     */
    public List<Share> searchShareMyself(long userId){
        ShareExample shareExample = new ShareExample();
        shareExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<Share> result = shareMapper.selectByExample(shareExample);
        return result;

    }

    /**
     * 新增分享
     * @param share
     * @return
     */
    public Boolean addShare(Share share){
        try {
            shareMapper.insertSelective(share);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    /**
     * 下架分享
     * @param shareId
     * @return
     */
    public Boolean outShare(Long shareId){
        Share share = new Share();
        share.setStatus(ShareEnum.OUT_STOCK.getCode());
        ShareExample example = new ShareExample();
        example.createCriteria().andShareIdEqualTo(shareId);
        try {
            shareMapper.updateByExampleSelective(share, example);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
