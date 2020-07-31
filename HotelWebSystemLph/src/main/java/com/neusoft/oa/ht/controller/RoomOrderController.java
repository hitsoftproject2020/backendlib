package com.neusoft.oa.ht.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.oa.ht.model.RoomOrderModel;
import com.neusoft.oa.ht.service.IRoomOrderService;
import com.neusoft.oa.restresult.Result;

@RestController
@CrossOrigin
@RequestMapping(value="/roomorder")
public class RoomOrderController {
	@Autowired
	private IRoomOrderService iRoomOrderService = null;
	
	@PostMapping(value="/add")
	public Result<String> add(RoomOrderModel roomOrderModel) throws Exception{
		iRoomOrderService.add(roomOrderModel);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加部门成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(RoomOrderModel roomOrderModel) throws Exception{
		iRoomOrderService.modify(roomOrderModel);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改部门成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(RoomOrderModel roomOrderModel) throws Exception{
		iRoomOrderService.delete(roomOrderModel);
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
	public Result<RoomOrderModel> getByNo(@RequestParam(required=true) int no) throws Exception{
		Result<RoomOrderModel> result=new Result<RoomOrderModel>();
		result.setResult(iRoomOrderService.seleteById(no));
		
		result.setStatus("OK");
		result.setMessage("取得指定部门对象成功!");
		return result;
	}
	@GetMapping(value="/getbyall")
	public Result<RoomOrderModel> getByAll() throws Exception{
		Result<RoomOrderModel> result=new Result<RoomOrderModel>();
		result.setList(iRoomOrderService.selectByAll());
		
		result.setStatus("OK");
		result.setMessage("取得指定部门对象成功!");
		return result;
	}
	

}
