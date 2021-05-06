package nLayeredDemo.core.logger.concretes;

import nLayeredDemo.core.logger.abstracts.LoggerService;
import nLayeredDemo.jLogger.*;

public class jLoggerAdapter implements LoggerService{

	private nLayeredDemo.jLogger.jLoggerManager _jlogger;
	
	public jLoggerAdapter() {
		
		_jlogger = new nLayeredDemo.jLogger.jLoggerManager();
	}
	@Override
	public void log(String message) {
		
		_jlogger.log(message);
	}

}
