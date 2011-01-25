/**
 * Copyright 2011 Les Syst�mes M�dicaux Imagem Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.imagem.gwtpplugin.projectfile;

public class Variable {

	private final String type;
	private final String name;
	private String imports;
	
	public Variable(String type, String name) {
		this(type, name, "");
	}
	
	public Variable(String type, String name, String imports) {
		this.type = type;
		this.name = name;
		this.imports = imports;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public String getImport() {
		return imports;
	}
	
	public String toString() {
		return type + " " + name;
	}
	
	public String getCapName() {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}
	
	public void setImport(String imports) {
		this.imports = imports;
	}
}
