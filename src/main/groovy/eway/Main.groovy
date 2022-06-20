package eway

import eway.constant.Constant
import eway.file.FileHandle
import eway.file.impl.FileHandleImpl
import eway.service.Service
import eway.service.impl.ServiceImpl

static void main(String[] args) {
    final FileHandle fileHandle = new FileHandleImpl()
    final Service service = new ServiceImpl()
    fileHandle.writeIntoFile(
            service.classifyMessByDate(
                    fileHandle.readFile(Constant.INPUT_DIR_PATH)))
}
