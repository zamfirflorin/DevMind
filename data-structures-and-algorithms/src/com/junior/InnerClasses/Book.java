package com.junior.InnerClasses;

import java.util.ArrayList;

public class Book {
	private ArrayList<Page> pages = new ArrayList<Page>();

	public Book(int noPages) {
		// first, allocate the space for all pages because the (real)
		// number of pages is needed when initializing a book
		for (int i = 0; i < noPages; i++) {
			pages.add(null);
		}
		for (int i = 0; i < noPages; i++) {
			pages.set(i, new Page(i + 1));
		}
	}

	public Page getPage(int pageNo) {
		if (pageNo < 1 || pageNo > pages.size()) {
			return null;
		}
		return pages.get(pageNo - 1);
	}

	// inner class definition:
	public class Page {
		private int pageNo;
		private String text;

		public Page(int pageNo, String text) {
			this.pageNo = pageNo;
			this.text = text + "\nPage: " + pageNo + " of: " + Book.this.pages.size();
		}

		public Page(int pageNo) {
			this(pageNo, "");
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public int getPageNo() {
			return this.pageNo;
		}
	}
}