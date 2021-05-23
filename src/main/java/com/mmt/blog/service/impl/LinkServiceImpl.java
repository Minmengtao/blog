package com.mmt.blog.service.impl;

import com.mmt.blog.dao.BlogLinkMapper;
import com.mmt.blog.entity.BlogLink;
import com.mmt.blog.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: minmengtao
 * @date: 2021/5/22
 */
@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private BlogLinkMapper blogLinkMapper;

    @Override
    public int getTotalLinks() {
        return blogLinkMapper.getTotalLinks(null);
    }

    @Override
    public Map<Byte, List<BlogLink>> getLinksForLinkPage() {
        //获取所有链接数据
        List<BlogLink> links = blogLinkMapper.findLinkList(null);
        if(!CollectionUtils.isEmpty(links)) {
            //根据type分组
            Map<Byte, List<BlogLink>> linkMap = links.stream().collect(Collectors.groupingBy(BlogLink::getLinkType));
            return linkMap;
        }
        return null;
    }
}
