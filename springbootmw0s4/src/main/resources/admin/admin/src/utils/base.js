const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootmw0s4/",
            name: "springbootmw0s4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootmw0s4/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Springboot的漫画网站"
        } 
    }
}
export default base
