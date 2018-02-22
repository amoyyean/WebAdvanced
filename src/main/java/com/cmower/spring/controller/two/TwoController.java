package com.cmower.spring.controller.two;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("two")
public class TwoController {
	@RequestMapping("")
	public String index() {
		return "two/index";
	}
	
	@RequestMapping("jslib")
	public String jslib() {
		return "two/index2";
	}
	
	@RequestMapping("jslib/{id}")
	public String jslib(@PathVariable String id) {
		return "two/index2";
	}
	
	@RequestMapping("attrVsPropGetter")
	public String attrVsPropGetter() {
		return "two/attr_prop_getter";
	}
	
	@RequestMapping("attrVsPropSetter")
	public String attrVsPropSetter() {
		return "two/attr_prop_setter";
	}
	
	@RequestMapping("attrSetter")
	public String attrSetter() {
		return "two/attr_setter";
	}
	
	@RequestMapping("valGetter")
	public String valGetter() {
		return "two/val_getter";
	}
	
	@RequestMapping("valSetter")
	public String valSetter() {
		return "two/val_setter";
	}
	
	@RequestMapping("textVsHtmlGSetter")
	public String textVsHtmlSGetter() {
		return "two/text_html_gsetter";
	}
	
	@RequestMapping("dataGSetter")
	public String dataGSetter() {
		return "two/data_gsetter";
	}
	
	@RequestMapping("domOperation")
	public String domOperation() {
		return "two/dom_operation";
	}
	
	@RequestMapping("initAjaxNprogress")
	public String initAjaxNprogress() {
		return "two/ajax_nprogress";
	}
	
	@RequestMapping("ajaxNprogress")
	@ResponseBody
	public String ajaxNprogress() {
		return "你好";
	}
	
}
