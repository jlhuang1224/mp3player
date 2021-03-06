package com.music.factory.model.playmode;

import com.music.factory.PlayModeFactory;

/**
 * 顺序获取前后一首歌的位置
 * @author Administrator
 */
public class SequencePlayMode extends AbstractPlayMode {

	private SequencePlayMode() {
	}

	@Override
	public int prevIndex(int index, int size) {
		return (index - 1 >= 0) ? index - 1 : size - 1;
	}

	@Override
	public int nextIndex(int index, int size) {
		return (index + 1 < size) ? index + 1 : 0;		
	}

	public static PlayModeFactory factory = new PlayModeFactory() {		
		@Override
		public AbstractPlayMode createPlayMode() {
			return new SequencePlayMode();
		}
	};
}
