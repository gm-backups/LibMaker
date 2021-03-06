/*
 * Copyright (C) 2012 IsmAvatar <IsmAvatar@gmail.com>
 * 
 * This file is part of LibMaker.
 * LibMaker is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package org.lateralgm.libmaker.backend;

import java.util.EnumMap;

public class Argument
	{
	public static enum Kind
		{
		EXPRESSION,STRING,BOTH,BOOLEAN,MENU,COLOR,FONT_STRING,SPRITE,SOUND,BACKGROUND,PATH,SCRIPT,
		OBJECT,ROOM,FONT,TIMELINE
		}

	public enum PArgument
		{
		CAPTION,KIND,DEF_VALUE,MENU_OPTS
		}

	private static final EnumMap<PArgument,Object> DEFS = PropertyMap.makeDefaultMap(PArgument.class,
			null,Kind.EXPRESSION,"0","item 1|item 2");

	public final PropertyMap<PArgument> properties = new PropertyMap<PArgument>(PArgument.class,DEFS);

	//Only available to Action
	/*package*/Argument(int id)
		{
		properties.put(PArgument.CAPTION,"Argument " + id + ":");
		}

	public void put(PArgument key, Object value)
		{
		properties.put(key,value);
		}

	public <V>V get(PArgument key)
		{
		return properties.get(key);
		}
	}
