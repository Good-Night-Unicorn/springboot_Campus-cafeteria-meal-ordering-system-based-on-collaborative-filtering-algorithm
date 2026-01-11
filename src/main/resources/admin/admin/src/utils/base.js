const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot38r71ot7/",
            name: "springboot38r71ot7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot38r71ot7/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于协同过滤算法的校园食堂订餐系统"
        } 
    }
}
export default base
