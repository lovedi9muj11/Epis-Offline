function xxx(){
	console.log("xxxx")
	$.ajax({
        type: "GET",
        url: "http://localhost:9090/controller/xxx",
//        data: JSON.stringify(bean),
//        dataType: "json",
        async: false,
        contentType: "application/json; charset=utf-8",
        success: function (res) {
        	console.log(res)
        	}
        })
}