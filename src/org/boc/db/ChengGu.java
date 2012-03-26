package org.boc.db;

public class ChengGu {
  private String sep = "\r\n    ";

  public final int[][] yz = new int[11][13];
  public final int[] mz = {0, 6, 7, 18, 9, 5, 16, 9, 15, 18, 8, 9, 5};
  public final int[] dz = {0, 5, 10, 8, 15, 16, 15, 8, 16, 8, 16,
                                  9, 17, 8, 17, 10, 8, 9, 18, 5, 10,
                                  10, 9, 8, 9, 15, 18, 7, 8, 16, 6};
  public final int[] hz = {0, 16, 6, 7, 10, 9, 16, 10, 8, 8, 9, 6, 6};

  {
    yz[1]= new int[]{0, 12,0,12,0,8,0,15,0,5,0,15,0};
    yz[2]= new int[]{0, 0,9,0,8,0,7,0,6,0,15,0,9};
    yz[3]= new int[]{0, 16,0,6,0,8,0,1,0,5,0,6,0};
    yz[4]= new int[]{0, 0,8,0,7,0,6,0,5,0,14,0,16};
    yz[5]= new int[]{0, 15,0,8,0,12,0,19,0,14,0,14,0};
    yz[6]= new int[]{0, 0,7,0,19,0,5,0,6,0,5,0,9};
    yz[7]= new int[]{0, 7,0,9,0,12,0,9,0,8,0,9,0};
    yz[8]= new int[]{0, 0,7,0,12,0,6,0,8,0,16,0,17};
    yz[9]= new int[]{0, 5,0,9,0,10,0,8,0,7,0,10,0};
    yz[10]= new int[]{0, 7,0,12,0,7,0,7,0,8,0,6,0};
  }

  public String[] desc = new String[100];
  {
    desc = new String[]{"","","","","","","","","","",""
        ,"","","","","","","","","","",""
        ,"��������������꣬"+sep+"���������������ˣ�"+sep+"��µµ�Ͱ��޶��գ�"+sep+"������򹰹�ƽ�ꡣ"
        ,"���������������ᣬ"+sep+"����ı�������ѳɣ�"+sep+"���޶��ֵ�Ӧ������"+sep+"����������ɢ�ˡ�"
        ,"������������»�ޣ�"+sep+"����ͥ��������Ӫ��"+sep+"�����׹�����޿���"+sep+"���������������̡�"
        ,"������������ҵ΢��"+sep+"����ͥӪ����ϡ�棻"+sep+"�����׹������̿��"+sep+"��һ�������԰ѳ֡�"
        ,"��ƽ����»������"+sep+"�����Ծ�Ӫ�²��ݣ�"+sep+"��������������⣬"+sep+"��������»�����ǡ�"

        ,"��һ��������������"+sep+"���ѿ����������ţ�"+sep+"��������ǹ����ȥ��"+sep+"���������겿�޳���"
        ,"��һ��������Ʈ�"+sep+"�����ڲ�ҵ�����У�"+sep+"���������������գ�"+sep+"��Ҳ����������ͨ��"
        ,"����������δ������"+sep+"�����й��������У�"+sep+"�������Ѯ�ƿ��ϣ�"+sep+"���ƾӸ���ʼΪ����"
        ,"������µµ������"+sep+"���������������ݣ�"+sep+"����ʹ���������"+sep+"�������Կ����ǳ"
        ,"��ææµµ������"+sep+"�������ƿ�����ͷ��"+sep+"���ѵ�����ҿ�����"+sep+"��������ʳ�����ǡ�"

        ,"�������������ı��"+sep+"�����в�Դ��ˮ����"+sep+"������������ʳ����"+sep+"����ʱ����һ������"
        ,"�������������ѳɣ�"+sep+"���ټ�ͽ�������ģ�"+sep+"������������ˮȥ��"+sep+"�������˵��ûƽ�"
        ,"��������������Σ�"+sep+"��ɮ��������»�ࣻ"+sep+"��������ҷ����"+sep+"���ճ��ݷ���ӡ�"
        ,"��ƽ����������ȫ��"+sep+"����ҵ�������ٴ���"+sep+"��Ӫҵ�������ؾɣ�"+sep+"��ʱ����ʳʤ��ǰ��"
        ,"��������µ��ƽ����"+sep+"�����ԳɼҸ����᣻"+sep+"�����и��ǳ�������"+sep+"���ξ���ȥ�ٰ�ɡ�"

        ,"����������²��ɣ�"+sep+"�����������Թ³ɣ�"+sep+"����Ȼ��ҵ��΢�У�"+sep+"��������ʱȥ������"
        ,"��һ����������ߣ�"+sep+"��������������ꣻ"+sep+"������������ʮ����"+sep+"��������ȥ�����ۡ�"
        ,"�����������˲��"+sep+"���������¾��Կգ�"+sep+"�����Ľ����ɼҼƣ�"+sep+"��������ʱ�����С�"
        ,"����ƽ��»���೤��"+sep+"���������������ţ�"+sep+"��ǰ���˪���ܹ���"+sep+"�������ض���������"
        ,"�����������²�ͬ��"+sep+"��Ϊ���ܸ��Է�ӹ��"+sep+"�����껹����ң����"+sep+"������ǰ����δͨ��"

        ,"���ÿ������ҿ�����"+sep+"������˫ü�岻����"+sep+"����ʹ�������˼ã�"+sep+"����ʱ����һ������"
        ,"��Ϊ�������������"+sep+"���������������ˣ�"+sep+"����»һ����������"+sep+"��������µ�Ƿ�����"
        ,"����������Ī����"+sep+"����֪��»ʤǰ;��"+sep+"������Ʋ������⣬"+sep+"��������Ȼ�㲻�ǡ�"
        ,"���������������Σ�"+sep+"��ǰ;����󱼲���"+sep+"��������������Ů��"+sep+"���������Ҳ���ࡣ"
        ,"�������ϱ����Կգ�"+sep+"��������������¡��"+sep+"����»�޿���������"+sep+"����������һ��ͬ��"

        ,"������������ĩ�꣬"+sep+"�������ӹ�����Ȼ��"+sep+"��ƽ��ԭ�����ϸ���"+sep+"�����в�Դ��ˮԴ��"
        ,"�������˵�δ������"+sep+"�����������ٲ��ˣ�"+sep+"���ֵ����׽��޿���"+sep+"��һ����ҵ����ɡ�"
        ,"���������������ᣬ"+sep+"���Գ�����ҫ��ͥ��"+sep+"�������������׽���"+sep+"��ʹ澲�ū��һ����"
        ,"��Ϊ��Ϊ�������ͣ�"+sep+"�����긣»Ҳ���⣻"+sep+"���������в����գ�"+sep+"������ǰ�����¸ߡ�"
        ,"��һ���ٻ�����ͨ��"+sep+"��������µ�����᣻"+sep+"��������ֶ�����⣬"+sep+"����ҵ��ʱ��»�ꡣ"

        ,"��һ����ͨ�����ܣ�"+sep+"��������˼��Ȼ�ܣ�"+sep+"��������Ȼ�ĽԺã�"+sep+"����ҵ�����Գ��ġ�"
        ,"���˸����������棬"+sep+"���˼ҷ��������У�"+sep+"��һ����»���żң�"+sep+"�������˼�һ���̡�"
        ,"���������������壬"+sep+"��ʫ�����������ɣ�"+sep+"��������ʳ��Ȼ�ȣ�"+sep+"�������˼��и��ˡ�"
        ,"�����������������"+sep+"���������·ѳ�ı��"+sep+"��һ����»ԴԴ����"+sep+"�������ٻ�ҫ���ס�"
        ,"���˸���������ͨ��"+sep+"��һ����»�����"+sep+"����������Գ�����"+sep+"����Դ�������ҷᡣ"

        ,"����»��ӯ����ȫ��"+sep+"��һ����ҫ��˫�ף�"+sep+"�������������վ���"+sep+"��������ң��������"
        ,"��ƽ����»��Ȼ����"+sep+"������˫ȫ��»�ɣ�"+sep+"����������Ϊ��ͣ�"+sep+"����������߽�ס�"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"

        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"

        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"

        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"
        ,"������������꣬"+sep+"�������������ˣ�"+sep+"µµ�Ͱ��޶��գ�"+sep+"����򹰹�ƽ�ꡣ"

        ,"","","","","","","","","",""
        ,"","","","","","","","","",""};
  }

}