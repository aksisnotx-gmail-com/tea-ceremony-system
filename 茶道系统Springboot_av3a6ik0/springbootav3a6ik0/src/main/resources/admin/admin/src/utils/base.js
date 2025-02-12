const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootav3a6ik0/",
            name: "springbootav3a6ik0",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootav3a6ik0/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "茶道系统"
        } 
    }
}
export default base
