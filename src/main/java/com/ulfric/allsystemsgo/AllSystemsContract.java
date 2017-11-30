package com.ulfric.allsystemsgo;

import java.nio.file.FileSystem;
import java.util.stream.Stream;

import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;

public interface AllSystemsContract {

	static Stream<FileSystem> fileSystemProvider() {
		return Stream.of(Configuration.unix(), Configuration.osX(), Configuration.windows())
				.map(Jimfs::newFileSystem);
	}

}
