package com.pinyougou.solrutil;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.SolrDataQuery;

/**
 * @description:
 * @createTime: 2018-12-27 16:16
 */
public class Dele {
    @Autowired
    private SolrTemplate solrTemplate;
    @Test
    public void dele(){
        SolrDataQuery query = new SimpleQuery("*:*");
        solrTemplate.delete(query);
        solrTemplate.commit();
    }
}
