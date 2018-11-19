package com.yang.blog.website.model.Vo;

import java.util.ArrayList;
import java.util.List;

public class AttachVoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> orderCriteria;

    private Integer limit;

    private Integer offset;

    public AttachVoExample(){
        orderCriteria =new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<Criteria> getOrderCriteria() {
        return orderCriteria;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void or(Criteria criteria){
        orderCriteria.add(criteria);
    }

    public Criteria or(){
        Criteria criteria= createCriteriaInternal();
        orderCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria(){
        Criteria criteria= createCriteriaInternal();
        if (orderCriteria.size()==0){
            orderCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal(){
        Criteria criteria= new Criteria();
        return criteria;
    }

    //清空
    public void clear(){
        orderCriteria.clear();
        orderByClause=null;
        distinct=false;
    }

    //GeneratedCriteria静态抽象方法
    protected abstract static class GeneratedCriteria{
        protected List<Criterion> criteria;

        protected GeneratedCriteria(){
            super();
            criteria =new ArrayList<Criterion>();
        }

        public boolean isValid(){
            return criteria.size()>0;
        }

        public List<Criterion> getAllCriteria(){
            return criteria;
        }

        public List<Criterion> getCriteria(){
            return criteria;
        }

        protected void addCriterion(String condition){
            if (condition==null){
                throw new RuntimeException("condition的值不能为空！");
            }
            criteria.add(new Criterion(condition));
        }

        /**
         * 三个参数
         * @param condition
         * @param value
         * @param property
         */
        protected void addCriterion(String condition,Object value,String property){
            if (value==null){
                throw new RuntimeException(property+"不能为空！");
            }
            criteria.add(new Criterion(condition,value));
        }

        /**
         * 四个参数
         * @param condition
         * @param value1
         * @param value2
         * @param property
         */
        protected void addCriterion(String condition,Object value1,Object value2,String property){
            if (value1==null || value2==null){
                throw new RuntimeException("在"+property+"之间不能为空！");
            }
            criteria.add(new Criterion(condition,value1,value2));
        }

        //id为空
        public Criteria andIdIsNull(){
            addCriterion("id is null");
            return (Criteria)this;
        }

        //id不为空
        public Criteria andIdIsNotNull(){
            addCriterion("id is not null");
            return (Criteria)this;
        }

        //id的值等于value参数
        public Criteria andIdEqualTo(Integer value){
            addCriterion("id =",value,"id");
            return (Criteria)this;
        }

        //id的值不等于value参数
        public Criteria andIdNotEqualTo(Integer value){
            addCriterion("id <>",value,"id");
            return (Criteria)this;
        }

        //id的值大于value参数
        public Criteria andIdGreaterThan(Integer value){
            addCriterion("id >",value,"id");
            return (Criteria)this;
        }

        //id的值大于或等于value参数
        public Criteria andIdGreaterThanOrEqualTo(Integer value){
            addCriterion("id >=",value,"id");
            return (Criteria)this;
        }

        //id的值小于value参数
        public Criteria andIdLessThan(Integer value){
            addCriterion("id <",value,"id");
            return (Criteria)this;
        }

        //id的值小于或等于value参数
        public Criteria andIdLessThanOrEqualTo(Integer value){
            addCriterion("id <=",value,"id");
            return (Criteria)this;
        }

        //id的值在value参数中
        public Criteria andIdIn(List<Integer> values){
            addCriterion("id in",values,"id");
            return (Criteria)this;
        }

        //id的值不在value参数中
        public Criteria andIdNotIn(List<Integer> values){
            addCriterion("id not in",values,"id");
            return (Criteria)this;
        }

        //id的值在value1与value2参数之间
        public Criteria andIdBetween(Integer value1,Integer value2){
            addCriterion("id between",value1,value2,"id");
            return (Criteria)this;
        }

        //id的值不在value1与value2参数之间
        public Criteria andIdNotBetween(Integer value1,Integer value2){
            addCriterion("id not between",value1,value2,"id");
            return (Criteria)this;
        }

        //fname为空
        public Criteria andFnameIsNull(){
            addCriterion("fname is null");
            return (Criteria)this;
        }

        //fname不为空
        public Criteria andFnameIsNotNull(){
            addCriterion("fname is not null");
            return (Criteria)this;
        }

        //fname的值等于value参数
        public Criteria andFnameEqualTo(String value){
            addCriterion("fname =",value,"fname");
            return (Criteria)this;
        }

        //fname的值不等于value参数
        public Criteria andFnameNotEqualTo(String value){
            addCriterion("fname <>",value,"fname");
            return (Criteria)this;
        }

        //fname的值大于value参数
        public Criteria andFnameGreaterThan(String value){
            addCriterion("fname >",value,"fname");
            return (Criteria)this;
        }

        //fname的值大于或等于value参数
        public Criteria andFnameGreaterThanOrEqualTo(String value){
            addCriterion("fname >=",value,"fname");
            return (Criteria)this;
        }

        //fname的值小于value参数
        public Criteria andFnameLessThan(String value){
            addCriterion("fname <",value,"fname");
            return (Criteria)this;
        }

        //fname的值小于或等于value参数
        public Criteria andFnameLessThanOrEqualTo(String value){
            addCriterion("fname <=",value,"fname");
            return (Criteria)this;
        }

        //fname的值在value参数中
        public Criteria andFnameIn(List<String> values){
            addCriterion("fname in",values,"fname");
            return (Criteria)this;
        }

        //fname的值不在value参数中
        public Criteria andFnameNotIn(List<String> values){
            addCriterion("fname not in",values,"fname");
            return (Criteria)this;
        }

        //fname的值在value1与value2参数之间
        public Criteria andFnameBetween(String value1,String value2){
            addCriterion("fname between",value1,value2,"fname");
            return (Criteria)this;
        }

        //fname的值不在value1与value2参数之间
        public Criteria andFnameNotBetween(String value1,String value2){
            addCriterion("fname not between",value1,value2,"fname");
            return (Criteria)this;
        }

        //ftype为空
        public Criteria andFtypeIsNull(){
            addCriterion("ftype is null");
            return (Criteria)this;
        }

        //ftype不为空
        public Criteria andFtypeIsNotNull(){
            addCriterion("ftype is not null");
            return (Criteria)this;
        }

        //ftype的值等于value参数
        public Criteria andFtypeEqualTo(String value){
            addCriterion("ftype =",value,"ftype");
            return (Criteria)this;
        }

        //ftype的值不等于value参数
        public Criteria andFtypeNotEqualTo(String value){
            addCriterion("ftype <>",value,"ftype");
            return (Criteria)this;
        }

        //ftype的值大于value参数
        public Criteria andFtypeGreaterThan(String value){
            addCriterion("ftype >",value,"ftype");
            return (Criteria)this;
        }

        //ftype的值大于或等于value参数
        public Criteria andFtypeGreaterThanOrEqualTo(String value){
            addCriterion("ftype >=",value,"ftype");
            return (Criteria)this;
        }

        //ftype的值小于value参数
        public Criteria andFtypeLessThan(String value){
            addCriterion("ftype <",value,"ftype");
            return (Criteria)this;
        }

        //ftype的值小于或等于value参数
        public Criteria andFtypeLessThanOrEqualTo(String value){
            addCriterion("ftype <=",value,"ftype");
            return (Criteria)this;
        }

        //ftype的值在value参数中
        public Criteria andFtypeIn(List<String> values){
            addCriterion("ftype in",values,"ftype");
            return (Criteria)this;
        }

        //ftype的值不在value参数中
        public Criteria andFtypeNotIn(List<String> values){
            addCriterion("ftype not in",values,"ftype");
            return (Criteria)this;
        }

        //ftype的值在value1与value2参数之间
        public Criteria andFtypeBetween(String value1,String value2){
            addCriterion("ftype between",value1,value2,"ftype");
            return (Criteria)this;
        }

        //ftype的值不在value1与value2参数之间
        public Criteria andFtypeNotBetween(String value1,String value2){
            addCriterion("ftype not between",value1,value2,"ftype");
            return (Criteria)this;
        }

        //fkey为空
        public Criteria andFkeyIsNull(){
            addCriterion("fkey is null");
            return (Criteria)this;
        }

        //fkey不为空
        public Criteria andFkeyIsNotNull(){
            addCriterion("fkey is not null");
            return (Criteria)this;
        }

        //fkey的值等于value参数
        public Criteria andFkeyEqualTo(String value){
            addCriterion("fkey =",value,"fkey");
            return (Criteria)this;
        }

        //fkey的值不等于value参数
        public Criteria andFkeyNotEqualTo(String value){
            addCriterion("fkey <>",value,"fkey");
            return (Criteria)this;
        }

        //fkey的值大于value参数
        public Criteria andFkeyGreaterThan(String value){
            addCriterion("fkey >",value,"fkey");
            return (Criteria)this;
        }

        //fkey的值大于或等于value参数
        public Criteria andFkeyGreaterThanOrEqualTo(String value){
            addCriterion("fkey >=",value,"fkey");
            return (Criteria)this;
        }

        //fkey的值小于value参数
        public Criteria andFkeyLessThan(String value){
            addCriterion("fkey <",value,"fkey");
            return (Criteria)this;
        }

        //fkey的值小于或等于value参数
        public Criteria andFkeyLessThanOrEqualTo(String value){
            addCriterion("fkey <=",value,"fkey");
            return (Criteria)this;
        }

        //fkey的值在value参数中
        public Criteria andFkeyIn(List<String> values){
            addCriterion("fkey in",values,"fkey");
            return (Criteria)this;
        }

        //fkey的值不在value参数中
        public Criteria andFkeyNotIn(List<String> values){
            addCriterion("fkey not in",values,"fkey");
            return (Criteria)this;
        }

        //fkey的值在value1与value2参数之间
        public Criteria andFkeyBetween(String value1,String value2){
            addCriterion("fkey between",value1,value2,"fkey");
            return (Criteria)this;
        }

        //fkey的值不在value1与value2参数之间
        public Criteria andFkeyNotBetween(String value1,String value2){
            addCriterion("fkey not between",value1,value2,"fkey");
            return (Criteria)this;
        }

        //author_id为空
        public Criteria andAuthorIdIsNull(){
            addCriterion("author_id is null");
            return (Criteria)this;
        }

        //author_id不为空
        public Criteria andAuthorIdIsNotNull(){
            addCriterion("author_id is not null");
            return (Criteria)this;
        }

        //author_id的值等于value参数
        public Criteria andAuthorIdEqualTo(Integer value){
            addCriterion("author_id =",value,"author_id");
            return (Criteria)this;
        }

        //author_id的值不等于value参数
        public Criteria andAuthorIdNotEqualTo(Integer value){
            addCriterion("author_id <>",value,"author_id");
            return (Criteria)this;
        }

        //author_id的值大于value参数
        public Criteria andAuthorIdGreaterThan(Integer value){
            addCriterion("author_id >",value,"author_id");
            return (Criteria)this;
        }

        //author_id的值大于或等于value参数
        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value){
            addCriterion("author_id >=",value,"author_id");
            return (Criteria)this;
        }

        //author_id的值小于value参数
        public Criteria andAuthorIdLessThan(Integer value){
            addCriterion("author_id <",value,"author_id");
            return (Criteria)this;
        }

        //author_id的值小于或等于value参数
        public Criteria andAuthorIdLessThanOrEqualTo(Integer value){
            addCriterion("author_id <=",value,"author_id");
            return (Criteria)this;
        }

        //author_id的值在value参数中
        public Criteria andAuthorIdIn(List<Integer> values){
            addCriterion("author_id in",values,"author_id");
            return (Criteria)this;
        }

        //author_id的值不在value参数中
        public Criteria andAuthorIdNotIn(List<Integer> values){
            addCriterion("author_id not in",values,"author_id");
            return (Criteria)this;
        }

        //author_id的值在value1与value2参数之间
        public Criteria andAuthorIdBetween(Integer value1,Integer value2){
            addCriterion("author_id between",value1,value2,"author_id");
            return (Criteria)this;
        }

        //author_id的值不在value1与value2参数之间
        public Criteria andAuthorIdNotBetween(Integer value1,Integer value2){
            addCriterion("author_id not between",value1,value2,"author_id");
            return (Criteria)this;
        }

    }

    //静态类Criteria继承GeneratedCriteria静态抽象方法
    public static class Criteria extends GeneratedCriteria{
        protected Criteria(){
            super();
        }
    }

    //Criterion静态类
    public static class Criterion{
        //private String
        protected Criterion(String condition){

        }

        protected Criterion(String condition,Object value,String typeHandler){

        }

        protected Criterion(String condition,Object value){

        }

        protected Criterion(String condition,Object value,Object secondValue){

        }
    }
}
