define(['jquery'],function($){
	
	function init(){
		
		//jquery 远程调用初始化操作
		$.ajaxSetup({
			// cache:false, TODO modal缓存
			contentType : "application/x-www-form-urlencoded;charset=utf-8",
			complete : function(XMLHttpRequest, textStatus) {
				if (!XMLHttpRequest.getResponseHeader) {
					return;
				}
				var sessionstatus = XMLHttpRequest.getResponseHeader("sessionstatus");
				// 通过XMLHttpRequest取得响应头，sessionstatus
				if (sessionstatus == "sessionOut") {
					bootbox.alert("您的登录已过期，请重新登录！");
					window.location.replace("/index.jsp");
					return;
				} else if (sessionstatus == "invalidRequest") {
					bootbox.alert("非法请求！");
					return;
				}
			}
		});

		//js Date对象的个性化配置
		Date.prototype.toYYYY_MM_DD = function() {
			var month = (parseInt(this.getMonth()) + 1) < 10 ? ("0" + (parseInt(this
					.getMonth()) + 1)) : (parseInt(this.getMonth()) + 1);
			var day = this.getDate() < 10 ? ("0" + this.getDate()) : this.getDate();
			return this.getFullYear() + "-" + month + "-" + day;
		};
		Date.prototype.Format = function(fmt) {
			var o = {
				"M+" : this.getMonth() + 1, // 月份
				"d+" : this.getDate(), // 日
				"h+" : this.getHours(), // 小时
				"m+" : this.getMinutes(), // 分
				"s+" : this.getSeconds(), // 秒
				"q+" : Math.floor((this.getMonth() + 3) / 3), // 季度
				"S" : this.getMilliseconds()
			// 毫秒
			};
			if (/(y+)/.test(fmt))
				fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
						.substr(4 - RegExp.$1.length));
			for ( var k in o)
				if (new RegExp("(" + k + ")").test(fmt))
					fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k])
							: (("00" + o[k]).substr(("" + o[k]).length)));
			return fmt;
		};
		
		
	};
    
	return {
		init:init
	};
	

	
});
