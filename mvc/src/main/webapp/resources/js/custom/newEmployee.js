$(document).ready(function(){
    $("#ajax1").click(function(){
	    $.ajax(
    		{
    			url: "/employee/checkServer",
    			type:"GET",
    			success: function(result){
    				alert(result);
    			}
    		}
	    );
    });
});