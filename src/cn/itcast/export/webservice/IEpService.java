package cn.itcast.export.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import cn.itcast.export.vo.ExportResult;
import cn.itcast.export.vo.ExportVo;

@Produces("*/*")   
public interface IEpService {
	
	@POST
	@Path("/user")
	@Consumes({"application/xml","application/json"})
	public void exportE(ExportVo export) throws Exception;
	
	@GET
	@Path("/user/{id}")
	@Consumes({"application/xml","application/json"})
	@Produces({ "application/xml", "application/json" })
	public ExportResult getResult(@PathParam("id") String id) throws Exception;
}
