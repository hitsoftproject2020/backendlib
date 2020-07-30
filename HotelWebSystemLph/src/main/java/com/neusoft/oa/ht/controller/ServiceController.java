package com.neusoft.oa.ht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.oa.ht.model.ServiceModel;
import com.neusoft.oa.ht.service.IServiceService;
import com.neusoft.oa.restresult.Result;

@RestController
@CrossOrigin
@RequestMapping(value="/service")
public class ServiceController {
	@Autowired
	private IServiceService iServiceService = null;
	
	@PostMapping(value="/add")
	public Result<String> add(ServiceModel serviceModel) throws Exception{
		iServiceService.add(serviceModel);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加部门成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(ServiceModel serviceModel) throws Exception{
		iServiceService.modify(serviceModel);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改部门成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(ServiceModel serviceModel) throws Exception{
		iServiceService.delete(serviceModel);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除部门成功!");
		return result;
	}
	//取得部门列表，分页模式
//	@GetMapping(value="/list/all/page")
//	public Result<CustomerModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
//		Result<CustomerModel> result=new Result<CustomerModel>();
//		result.setCount(ds.getCountByAll());
//		result.setPageCount(ds.getPageCountByAll(rows));
//		result.setRows(rows);
//		result.setPage(page);
//		result.setList(ds.getListByAllWithPage(rows, page));
//		
//		result.setStatus("OK");
//		result.setMessage("取得部门列表分页方式成功!");
//		return result;
//	}
	@GetMapping(value="/getbyno")
	public Result<ServiceModel> getByNo(@RequestParam(required=true) int no) throws Exception{
		Result<ServiceModel> result=new Result<ServiceModel>();
		result.setResult(iServiceService.seleteById(no));
		
		result.setStatus("OK");
		result.setMessage("取得指定部门对象成功!");
		return result;
	}
	@GetMapping(value="/getbyall")
	public Result<ServiceModel> getByAll() throws Exception{
		Result<ServiceModel> result=new Result<ServiceModel>();
		result.setList(iServiceService.selectByAll());
		
		result.setStatus("OK");
		result.setMessage("取得指定部门对象成功!");
		return result;
	}

}
