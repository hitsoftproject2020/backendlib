package com.neusoft.oa.ht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.oa.ht.model.ServiceOrderModel;
import com.neusoft.oa.ht.service.IServiceOrderService;
import com.neusoft.oa.restresult.Result;

@RestController
@RequestMapping(value="/serviceorder")
public class ServiceOrderController {
	@Autowired
	private IServiceOrderService iServiceOrderService = null;
	
	@PostMapping(value="/add")
	public Result<String> add(ServiceOrderModel serviceOrderModel) throws Exception{
		iServiceOrderService.add(serviceOrderModel);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加部门成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(ServiceOrderModel serviceOrderModel) throws Exception{
		iServiceOrderService.modify(serviceOrderModel);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改部门成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(ServiceOrderModel serviceOrderModel) throws Exception{
		iServiceOrderService.delete(serviceOrderModel);
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
	@GetMapping(value="/get")
	public Result<ServiceOrderModel> getByNo(@RequestParam(required=true) int no) throws Exception{
		Result<ServiceOrderModel> result=new Result<ServiceOrderModel>();
		result.setResult(iServiceOrderService.seleteById(no));
		
		result.setStatus("OK");
		result.setMessage("取得指定部门对象成功!");
		return result;
	}

}
