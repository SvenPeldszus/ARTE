package arte.shell;

public enum Shell_Status {
	Any,
	No_Solution_Loaded,
	Program_Graph,
	Solution_Loaded;

	public boolean isCompatible(Shell_Status requiredStatus) {
		if (requiredStatus == this)
			return true;
		if (requiredStatus == Any)
			return true;
		if (requiredStatus == Solution_Loaded)
			return this==Solution_Loaded || this == Program_Graph;
		if (requiredStatus == No_Solution_Loaded)
			return true;
		if (requiredStatus == Program_Graph)
			return this == Program_Graph;
		return false;
	}
}
