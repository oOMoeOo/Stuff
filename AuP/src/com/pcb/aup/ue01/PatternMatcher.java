package com.pcb.aup.ue01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.pcb.aup.util.StdIn;

public class PatternMatcher {

	private String text;

	public PatternMatcher(final String text) {
		this.text = text;
	}

	public String text() {
		return text;
	}
	
	public List<Match> matches(final String pattern) {
		if (pattern.contains("%")) {
			return advancedMatch(pattern);
		}
		return Collections.singletonList(simpleMatch(pattern));
	}

	public Match simpleMatch(final String pattern) {
		Match match = new Match(text, pattern);
		for (int t = 0; t < text().length() - pattern.length() + 1; t++) {

			// looking for pattern
			boolean patternFound = true;
			for (int p = 0; p < pattern.length(); p++) {
				if (text().charAt(t + p) != pattern.charAt(p)) {
					patternFound = false;
					break;
				}
			}
			if (patternFound) match.addMatch(t);
		}
		return match;
	}

	public List<Match> advancedMatch(final String pattern) {
		String[] segments = pattern.split("%");
		List<Match> matches = new LinkedList<Match>();
		for (String segment : segments) {
			matches.add(simpleMatch(segment));
		}
		return matches;
	}

	public static void main(String[] args) {
		String text = StdIn.askString("Input Text: ");
		String pattern = StdIn.askString("Simple Pattern: ");
		
		PatternMatcher matcher = new PatternMatcher(text);
		List<Match> matches = matcher.matches(pattern);
		System.out.println(text);
		for (Match match : matches) {
			System.out.println(match);
		}
	}

	private class Match {

		private List<Integer> matches = new LinkedList<Integer>();
		private String text;
		private String pattern;

		public Match(String text, String pattern) {
			this.text = text;
			this.pattern = pattern;
		}

		public void addMatch(final int index) {
			matches.add(index);
		}
		
		private boolean[] toMatchArray() {
			boolean[] matchArray = new boolean[text.length()];
			for (int match : matches) {
				for (int i = 0; i < pattern.length(); i++) {
					matchArray[match + i] = true;
				}
			}
			return matchArray;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			boolean[] matchIndices = toMatchArray();
			for (int i = 0; i < matchIndices.length; i++) builder.append(matchIndices[i] ? text.charAt(i) : "-");
			return builder.toString();
		}
	}

}
