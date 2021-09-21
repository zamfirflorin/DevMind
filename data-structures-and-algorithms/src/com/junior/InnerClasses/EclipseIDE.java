package com.junior.InnerClasses;

public class EclipseIDE {
	private String path;

	public EclipseIDE(String path) {
		this.path = path;
	}

	// class is package-private in order to analyze external use cases
	static class WorkspaceName {
		private String workspaceName;

		public WorkspaceName(String workspaceName) {
			this.workspaceName = workspaceName;
		}

		public String getWorkspaceName() {
			return workspaceName;
		}
	}

	class FilePath {
		public String getFilePath(String fileName) {
			return EclipseIDE.this.path + "/" + fileName;
		}
	}
}
