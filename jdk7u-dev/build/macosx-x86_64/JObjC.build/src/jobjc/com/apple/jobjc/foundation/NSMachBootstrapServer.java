package com.apple.jobjc.foundation;

public  class NSMachBootstrapServer extends com.apple.jobjc.foundation.NSPortNameServer {
	public NSMachBootstrapServer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMachBootstrapServer(final NSMachBootstrapServer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend portForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_portForName_IMetInst(){
		return ((portForName_IMetInst != null)
	? (portForName_IMetInst)
	: (portForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "portForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort portForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend portForName_IMetInst = get_portForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		portForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		portForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend portForName_host_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_portForName_host_IMetInst(){
		return ((portForName_host_IMetInst != null)
	? (portForName_host_IMetInst)
	: (portForName_host_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "portForName:host:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort portForName_host(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString host){
			final com.apple.jobjc.Invoke.MsgSend portForName_host_IMetInst = get_portForName_host_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		portForName_host_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, host);
		portForName_host_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerPort_name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerPort_name_IMetInst(){
		return ((registerPort_name_IMetInst != null)
	? (registerPort_name_IMetInst)
	: (registerPort_name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerPort:name:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean registerPort_name(final com.apple.jobjc.foundation.NSPort port, final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend registerPort_name_IMetInst = get_registerPort_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerPort_name_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, port);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		registerPort_name_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend servicePortWithName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_servicePortWithName_IMetInst(){
		return ((servicePortWithName_IMetInst != null)
	? (servicePortWithName_IMetInst)
	: (servicePortWithName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "servicePortWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort servicePortWithName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend servicePortWithName_IMetInst = get_servicePortWithName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		servicePortWithName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		servicePortWithName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
