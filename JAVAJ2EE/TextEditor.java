package com.spell;

public class TextEditor {
	
	private SpellCheck spellcheck;

	public TextEditor(SpellCheck spellcheck) {
		super();
		this.spellcheck = spellcheck;
	}

	public void callSpellCheck() {
		spellcheck.checkSpelling();
	}
		



}
