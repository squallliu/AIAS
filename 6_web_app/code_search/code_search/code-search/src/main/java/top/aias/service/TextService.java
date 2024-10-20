package top.aias.service;

import top.aias.domain.TextInfo;

import java.util.List;

/**
 * 文本服务接口
 * Service Interface
 *
 * @author Calvin
 * @mail 179209347@qq.com
 **/
public interface TextService {
    /**
     * 添加文本
     */
    public void addText(TextInfo textInfoDto);

    /**
     * 添加文本
     */
    public void addTexts(List<TextInfo> texts);

    /**
     * 更新文本信息
     */
    public void update(List<TextInfo> list);

    /**
     * 文本信息列表
     */
    public List<TextInfo> getTextList();
}