package com.nowcoder.community.entity;

/**
 * 封装分页相关信息
 */
public class Page {

    private int current = 1;

    private int limit = 10;

    private int rows;
    // 查询路径（用于复用分页链接）
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current >= 1){
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit >= 1 && limit <= 100){
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows >= 0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页起始行
     * @return
     */
    public int getOffset() {
        // current * limit - limit
        return(current-1)*limit;
    }

    /**
     * 获取总页数
     * @return
     */
    public int getTotal(){
        // 取整 rows / limit [+1]
        if(rows % limit == 0){
            return rows / limit;
        }else{
            return rows/limit + 1;
        }
    }

    /**
     * 显示第几页到第几页
     * @return
     */
    public int getFrom(){
        int from = current - 3;
        return from<1 ? 1 : from;
    }

    public int getTo(){
        int to = current + 3;
        int total = getTotal();
        return to > total ? total : to;
    }
}
