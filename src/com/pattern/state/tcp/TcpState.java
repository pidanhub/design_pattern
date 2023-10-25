package com.pattern.state.tcp;

public enum TcpState {
	//	Established,
//	Listening,
//	Closed;
//
	Closed {
		@Override
		public TcpState nextState () {
			return Listening;
		}
	},
	
	Listening {
		@Override
		public TcpState nextState () {
			return Established;
		}
	},
	
	Established {
		@Override
		public TcpState nextState () {
			return Closed;
		}
	};
	
	public abstract TcpState nextState ();
}