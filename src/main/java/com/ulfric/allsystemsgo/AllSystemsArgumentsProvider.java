package com.ulfric.allsystemsgo;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;

public class AllSystemsArgumentsProvider implements ArgumentsProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
		return Stream.of(Configuration.unix(), Configuration.osX(), Configuration.windows())
				.map(Jimfs::newFileSystem)
				.map(Arguments::of);
	}

}
